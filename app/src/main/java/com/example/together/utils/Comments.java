package com.example.together.utils;

public class Comments {


    // TODO
    //  1- sign up missing interests from api
    //  2- also profile missing interests from api

    // FIXME - when gone from login activity call api again why ??


    // FIxME - Replace marginStart with marginleft

     /*   <!-- <FrameLayout
    android:layout_marginBottom="16dp"
    android:layout_gravity="center_horizontal"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

         <ImageView
    android:layout_width="200dp"
    android:layout_height="200dp"
    android:padding="6dp"
    android:src="@drawable/group"/>

         <ImageView
    android:src="@drawable/frame"
    android:layout_width="200dp"
    android:layout_height="200dp" />
         </FrameLayout>-->*/
    /*

    private void loginObservable(UserLogin userLogin) {
        userViewModel.login(userLogin).observe(this, loginRes -> {
            if (loginRes.isConFailed()) {
                showErrorAlert("Failed connect to host!", this);
            } else {
                if (loginRes.isSuccess()) {
                    Log.i(TAG, "LoginActivity -- signUpObservable: go to home");
                    Storage storage = new Storage(this);
                    storage.saveUserData(loginRes.getToken(), loginRes.getId());
                    Intent intent = new Intent(this, ProfileActivity.class);
                    startActivity(intent);

                } else { // not valid user
                    Log.i(TAG, "LoginActivity -- signUpObservable: not valid ");
                    showErrorAlert(loginRes.getResponse(), this);
                }
            }

        });
    }
     */
    /*
        public static final String SING_UP_FAILED = "this email is exist";

    public static final String LOGIN_SUCCESS = "log in success";
    public static final String LOGIN_EMAIL_FAIILED = "this mail not registered";
    public static final String LOGIN_pass_FAIILED = "password not correct";
     */
    /**
     * beacause after each click on sign up i remove the observable so
     * when he listen for livedata found ot filled with old value
     * so i need to clear it to ensure that code will call signUp call again and
     * recevie fres response
     */
  /*  public void clearSignUpRes() {
        signUpRes = null;
    }

    */
    /*

      private MutableLiveData makeRequest(M reqBody) {
//        Call<LoginResponse> calLog = apiInterface.login(new UserLogin("", ""));
        MutableLiveData liveData = new MutableLiveData();

        if (reqBody instanceof User) {
            User user = (User) reqBody;
            Call<SignUpResponse> calSign = apiInterface.signUp(user);
            CustomCall customCallBack = new CustomCall(calSign);
            liveData = customCallBack.makeRequest();

        } else if (reqBody instanceof UserLogin) {
            UserLogin userLogin = (UserLogin) reqBody;
            Call<LoginResponse> loginCall = apiInterface.login(userLogin);
            CustomCall customCall = new CustomCall(loginCall);
            liveData = customCall.makeRequest();
        }
        return liveData;
    }

    class CustomCall<L> {

        private Call<L> call;

        public CustomCall(Call<L> call) {
            this.call = call;
        }


        public MutableLiveData makeRequest() {

            MutableLiveData liveData = new MutableLiveData();

            call.enqueue(new Callback<L>() {
                @Override
                public void onResponse(Call<L> call, Response<L> res) {
                    if (res.body() instanceof SignUpResponse) {
                        liveData.setValue(((SignUpResponse) res.body()).response);
                    }

                }

                @Override
                public void onFailure(Call<L> call, Throwable t) {

                }
            });

            return liveData;

        }

    }


     */

/*        log = userViewModel.signUp(user).hasObservers() ? "has" : "not has";
        Log.i(TAG, "userSignUpObservable: 2- " + log);*/

 /*   public void signUp(User user) {
        if (signUpRes == null) {
            signUpRes = userRepo.signUp(user);
        }
    }

    public MutableLiveData<String> getSignUpRes() {
        if (signUpRes == null) {
            signUpRes = new MutableLiveData<>();
        }
        return signUpRes;
    }*/

    //
//    public UserViewModel() {
////        signUpRes = userRepo.signUp();
//    }

}
