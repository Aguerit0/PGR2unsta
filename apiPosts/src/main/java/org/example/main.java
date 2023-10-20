package org.example;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class main {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        // Realizo las cuatro operaciones CRUD con publicaciones
        crearPublicacion();
        obtenerPublicaciones();
        actualizarPublicacion();
        eliminarPublicacion();
        System.out.println("\n\nMuestro de nuevo la lista de publicaciones\n\n");
        obtenerPublicaciones();
    }

    // Método GET: Obtener una lista de publicaciones
    public static void obtenerPublicaciones() {
        try {
            URL url = new URL(BASE_URL + "/posts");
            //connection para la peticion
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Analizar la respuesta JSON con Gson
                //Gson sirve para convertir la respuesta en un objeto, luego lo paso a un array y lo muestro
                Publicacion[] publicaciones = gson.fromJson(response.toString(), Publicacion[].class);
                System.out.println("Método GET - Lista de Publicaciones:");
                for (Publicacion publicacion : publicaciones) {
                    System.out.println(publicacion);
                }
            } else {
                System.out.println("Error en la solicitud GET. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método POST: Crear una nueva publicación
    // Método POST: Crear una nueva publicación
    public static void crearPublicacion() {
        try {
            URL url = new URL(BASE_URL + "/posts");

            // Abrir una conexión HTTP con la URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST"); // Configurar la solicitud como POST
            connection.setRequestProperty("Content-Type", "application/json; utf-8"); // Configurar el tipo de contenido
            connection.setRequestProperty("Accept", "application/json"); // Configurar el tipo de respuesta esperada
            connection.setDoOutput(true); // Permitir la escritura de datos en la conexión

            Publicacion nuevaPublicacion = new Publicacion(1, "Nuevo Título", "Contenido de la nueva publicación");

            // Convierto a JSON
            String jsonPublicacion = gson.toJson(nuevaPublicacion);

            // Escribir el JSON en el cuerpo de la solicitud
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPublicacion.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Envio la solicitud POST y obtener el código de respuesta
            int responseCode = connection.getResponseCode();

            // Verifico si la publicación se creó exitosamente
            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Método POST - Publicación creada exitosamente.");
            } else {
                System.out.println("Error en la solicitud POST. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Método PUT: Actualizar una publicación existente
    public static void actualizarPublicacion() {
        try {
            int idPublicacionAActualizar = 1; //ID de la publicación que quiero actualizar
            URL url = new URL(BASE_URL + "/posts/" + idPublicacionAActualizar);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            Publicacion publicacionActualizada = new Publicacion(1, "Título Actualizado", "Contenido actualizado");
            String jsonPublicacion = gson.toJson(publicacionActualizada);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPublicacion.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Método PUT - Publicación actualizada exitosamente.");
            } else {
                System.out.println("Error en la solicitud PUT. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método DELETE: Eliminar una publicación
    public static void eliminarPublicacion() {
        try {
            int idPublicacionAEliminar = 1; // ID de la publicación que quiero eliminar
            URL url = new URL(BASE_URL + "/posts/" + idPublicacionAEliminar);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Método DELETE - Publicación eliminada exitosamente.");
            } else {
                System.out.println("Error en la solicitud DELETE. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Publicacion {
        private int userId;
        private String title;
        private String body;

        public Publicacion(int userId, String title, String body) {
            this.userId = userId;
            this.title = title;
            this.body = body;
        }

        // Getters y setters

        @Override
        public String toString() {
            return "Publicacion{" +
                    "userId=" + userId +
                    ", title='" + title + '\'' +
                    //", body='" + body + '\'' +
                    '}';
        }
    }
}
