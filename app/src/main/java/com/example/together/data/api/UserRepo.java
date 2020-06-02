package com.example.together.data.api;

import androidx.lifecycle.MutableLiveData;

import com.example.together.data.model.GeneralResponse;
import com.example.together.data.model.Group;
import com.example.together.data.model.GroupDetails;
import com.example.together.data.model.Interests;
import com.example.together.data.model.JoinGroupResponse;
import com.example.together.data.model.LoginResponse;
import com.example.together.data.model.User;
import com.example.together.data.model.UserGroup;
import com.example.together.data.model.UserInterests;
import com.example.together.data.model.UserLogin;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private ApiProvider provider;

    public UserRepo() {
        provider = new ApiProvider();
    }

    public MutableLiveData<String> signUp(User user) {
        return provider.signUp(user);
    }

    public MutableLiveData<LoginResponse> login(UserLogin userLogin) {
        return provider.login(userLogin);
    }

    public MutableLiveData<User> fetchUserData(int id, String token) {
        return provider.fetchUserData(id,token) ;
    }


    public MutableLiveData<GeneralResponse> updateUserProfile(int id, String token,User user) {
        return provider.updateUserProfile(id,token,user) ;
    }

    public MutableLiveData<GeneralResponse> updateUserInterests(int id,String token, UserInterests interests) {
        return provider.updateUserInterests(id,token,interests) ;
    }

    public MutableLiveData<GeneralResponse> createGroup(Group group, String token) {
        return provider.createGroup(group,token);
    }

    public MutableLiveData<GeneralResponse> joinGroup(int gpId, int userID,  String token) {
        return provider.requestJoinGroup(gpId, userID, token);
    }

    public MutableLiveData<List<JoinGroupResponse>> getAllResponsesForGroup(int gpId, String token) {
        return provider.getAllResponsesForGroup(gpId,token);
    }

    public MutableLiveData<GeneralResponse> addGroupMember(int gpID, int userID, int adminID, String token) {
        return provider.addGroupMember(gpID, userID, adminID,token);
    }

    public MutableLiveData<ArrayList<UserGroup>> getAllUserGroups(int userId, String token){

        return  provider.getAllUserGroups(userId,token);
    }
    public  MutableLiveData<ArrayList<Interests>> getAllInterests(String token){

        return provider.getAllInterests(token);
    }
    public  MutableLiveData<GroupDetails> getSpecificGroupDetails(int groupId,String token){
        return  provider.getSpecificGroupDetails(groupId,token);
    }
   public MutableLiveData<GeneralResponse> removeMemberFromGroup(int groupId,int id,int adminId,String token){
        return  provider.removeMemberFromGroup(groupId, id, adminId,token);
   }

    public MutableLiveData<GeneralResponse> updateGroupInfo(int gpID, int adminID, Group group, String token) {
        return provider.updateGroupInfo(gpID, adminID, group, token);
    }


    public MutableLiveData<GeneralResponse> acceptJoinReqGroup(int reqID, int adminID, String token) {
        return provider.acceptJoinReqGroup(reqID, adminID, token);
    }


    public MutableLiveData<GeneralResponse> rejectJoinReqGroup(int reqID, String token) {
        return provider.rejectJoinReqGroup(reqID,  token);
    }

}
