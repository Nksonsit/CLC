package com.drkeironbrown.clc.api;


import com.drkeironbrown.clc.model.BaseResponse;
import com.drkeironbrown.clc.model.Category;
import com.drkeironbrown.clc.model.CategoryReq;
import com.drkeironbrown.clc.model.ForgotPasswordReq;
import com.drkeironbrown.clc.model.LoginReq;
import com.drkeironbrown.clc.model.PaidProduct;
import com.drkeironbrown.clc.model.PaidProductReq;
import com.drkeironbrown.clc.model.PayMoney;
import com.drkeironbrown.clc.model.RegisterReq;
import com.drkeironbrown.clc.model.Shop;
import com.drkeironbrown.clc.model.SubCategory;
import com.drkeironbrown.clc.model.SubCategoryReq;
import com.drkeironbrown.clc.model.UpdateNotificationReq;
import com.drkeironbrown.clc.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AppApi {

    @POST("UserLogin.php")
    Call<BaseResponse<User>> getLogin(@Body LoginReq loginReq);

    @POST("UserRegister.php")
    Call<BaseResponse<User>> getRegister(@Body RegisterReq registerReq);

    @GET("GetCategories.php")
    Call<BaseResponse<List<Category>>> getCategories();


    @POST("GetCategoriesByName.php")
    Call<BaseResponse<List<Category>>> getCategoriesByName(@Body CategoryReq categoryReq);


    @POST("GetSubCategories.php")
    Call<BaseResponse<List<SubCategory>>> getSubCategories(@Body SubCategoryReq subCategoryReq);

    @GET("GetShop.php")
    Call<BaseResponse<List<Shop>>> getShop();


    @POST("PayMoney.php")
    Call<BaseResponse> payMoney(@Body PayMoney payMoney);

    @POST("GetPayments.php")
    Call<BaseResponse<List<PaidProduct>>> getPaidProducts(@Body PaidProductReq paidProductReq);

    @POST("UpdateNotification.php")
    Call<BaseResponse> updateNotification(@Body UpdateNotificationReq updateNotificationReq);

    @POST("UpdateFullPay.php")
    Call<BaseResponse> updatePayment(@Body UpdateNotificationReq updateNotificationReq);

    @POST("GetForgotPassword.php")
    Call<BaseResponse> getForgotPassword(@Body ForgotPasswordReq forgotPasswordReq);
}
