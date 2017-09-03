package mnz.creatori.carsjavaretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mnz.creatori.carsjavaretrofit.Api.CarsApi;
import mnz.creatori.carsjavaretrofit.Api.CarsResponse;
import mnz.creatori.carsjavaretrofit.Model.Car;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private static CarsApi carsApi;
    private Retrofit retrofit;
    private List<Car> carsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);


        carsList = new ArrayList<Car>();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://goo.gl/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        carsApi = retrofit.create(CarsApi.class);

        carsApi.getData().enqueue(new Callback<CarsResponse>() {
            @Override
            public void onResponse(Call<CarsResponse> call, Response<CarsResponse> response) {
                if(response.isSuccessful()){
                    CarsResponse carsResponse = response.body();

                    Log.d("MainActivity", carsResponse.getClass().getSimpleName());
                    Log.d("MainActivity", carsResponse.getCars().getClass().getSimpleName());
                    Log.d("MainActivity", carsResponse.getCars().size() + "");

                    carsList.addAll(carsResponse.getCars());
                    tv.setText(String.valueOf(carsResponse.getCars().get(0).toString()));
//                    tv.setText("1");
                }
            }

            @Override
            public void onFailure(Call<CarsResponse> call, Throwable t) {

                tv.setText("Some Error");
            }
        });


    }


}
