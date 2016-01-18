package com.velasquez.salazar.gonzalo.retrofit_rest_service.model;

import com.velasquez.salazar.gonzalo.retrofit_rest_service.util.EntityUtil;

import java.io.Serializable;

public class DeviceDto implements Serializable {

    private Long id;
    private String imei;
    private String name;
    private String icon;
    private String color;
    private Boolean battery;
    private Boolean sos;
    private String sosMails;
    private String sosCellphones;
    private String batteryMails;
    private String batteryCellphones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isBattery() {
        return battery;
    }

    public void setBattery(Boolean battery) {
        this.battery = battery;
    }

    public Boolean isSos() {
        return sos;
    }

    public void setSos(Boolean sos) {
        this.sos = sos;
    }

    public String getSosMails() {
        return sosMails;
    }

    public void setSosMails(String sosMails) {
        this.sosMails = sosMails;
    }

    public String getSosCellphones() {
        return sosCellphones;
    }

    public void setSosCellphones(String sosCellphones) {
        this.sosCellphones = sosCellphones;
    }

    public String getBatteryMails() {
        return batteryMails;
    }

    public void setBatteryMails(String batteryMails) {
        this.batteryMails = batteryMails;
    }

    public String getBatteryCellphones() {
        return batteryCellphones;
    }

    public void setBatteryCellphones(String batteryCellphones) {
        this.batteryCellphones = batteryCellphones;
    }

    public static DeviceDto createNew() {
        DeviceDto deviceDto = new DeviceDto();
        deviceDto.id = EntityUtil.DEFAULT_LONG;
        deviceDto.imei = EntityUtil.DEFAULT_STRING;
        deviceDto.name = EntityUtil.DEFAULT_STRING;
        deviceDto.icon = EntityUtil.DEFAULT_STRING;
        deviceDto.color = EntityUtil.DEFAULT_STRING;
        deviceDto.battery = EntityUtil.DEFAULT_BOOLEAN;
        deviceDto.sos = EntityUtil.DEFAULT_BOOLEAN;
        deviceDto.sosMails = EntityUtil.DEFAULT_STRING;
        deviceDto.sosCellphones = EntityUtil.DEFAULT_STRING;
        deviceDto.batteryMails = EntityUtil.DEFAULT_STRING;
        deviceDto.sosCellphones = EntityUtil.DEFAULT_STRING;
        return deviceDto;
    }


    @Override
    public String toString() {
        return "DeviceDto{" +
                "id=" + id +
                ", imei='" + imei + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", color='" + color + '\'' +
                ", battery='" + battery + '\'' +
                ", sos='" + sos + '\'' +
                ", sosMails='" + sosMails + '\'' +
                ", sosCellphones='" + sosCellphones + '\'' +
                ", batteryMails='" + batteryMails + '\'' +
                ", batteryCellphones='" + batteryCellphones + '\'' +
                '}';
    }
}
