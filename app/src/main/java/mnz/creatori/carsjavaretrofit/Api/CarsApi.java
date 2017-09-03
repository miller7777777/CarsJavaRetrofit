package mnz.creatori.carsjavaretrofit.Api;


import java.util.List;

import mnz.creatori.carsjavaretrofit.Model.Car;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CarsApi {

    @GET("1tW53X")
    Call<CarsResponse> getData();
}
