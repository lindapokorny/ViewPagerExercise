package com.pursuit.viewpagerexercise.network;

import com.pursuit.viewpagerexercise.model.MyPojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlanetsService {
    @GET("JDVila/storybook/master/planets.json")
    Call<MyPojo> getPlanets();
}
