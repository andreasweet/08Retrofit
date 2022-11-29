package com.example.a08_retrofit.Conexiones;

import com.example.a08_retrofit.Modelos.Album;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface APIConexiones {
    //Todos los endpoint y retornos de la API

    @GET("/albums")
     Call<ArrayList<Album>>getAlbums();

    @GET("/albums/{idAlbum}")
    Call<Album> getAlbum(@Path("idAlbum")String idAlbum); //los path siempre son strings
}
