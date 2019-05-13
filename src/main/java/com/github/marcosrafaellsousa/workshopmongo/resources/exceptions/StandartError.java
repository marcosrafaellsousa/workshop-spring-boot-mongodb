package com.github.marcosrafaellsousa.workshopmongo.resources.exceptions;

import java.io.Serializable;

public class StandartError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String error;
    private String messege;
    private String path;

    public StandartError() {
    }

    public StandartError(Long timestamp, Integer status, String error, String messege, String path) {
        this.setTimestamp(timestamp);
        this.setStatus(status);
        this.setError(error);
        this.setMessege(messege);
        this.setPath(path);
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
