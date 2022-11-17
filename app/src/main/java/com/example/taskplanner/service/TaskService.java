package com.example.taskplanner.service;

import com.example.taskplanner.Dto.TaskDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TaskService {
    @GET("/V1/tasks")
    Call<List<TaskDto>> getAll();
}
