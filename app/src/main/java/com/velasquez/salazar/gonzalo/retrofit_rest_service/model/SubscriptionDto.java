package com.velasquez.salazar.gonzalo.retrofit_rest_service.model;

import com.velasquez.salazar.gonzalo.retrofit_rest_service.util.EntityUtil;

import java.io.Serializable;

public class SubscriptionDto implements Serializable {

    private Long id;
    private String from;
    private String to;
    private Integer maxSms;
    private String status;
    private Long servicePlanId;
    private String servicePlanName;
    private DeviceDto device;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getMaxSms() {
        return maxSms;
    }

    public void setMaxSms(Integer maxSms) {
        this.maxSms = maxSms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getServicePlanId() {
        return servicePlanId;
    }

    public void setServicePlanId(Long servicePlanId) {
        this.servicePlanId = servicePlanId;
    }

    public String getServicePlanName() {
        return servicePlanName;
    }

    public void setServicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
    }

    public DeviceDto getDevice() {
        return device;
    }

    public void setDevice(DeviceDto device) {
        this.device = device;
    }

    public static SubscriptionDto createNew() {
        SubscriptionDto subscriptionDto = new SubscriptionDto();
        subscriptionDto.id = EntityUtil.DEFAULT_LONG;
        subscriptionDto.from = EntityUtil.DEFAULT_STRING;
        subscriptionDto.to = EntityUtil.DEFAULT_STRING;
        subscriptionDto.status = EntityUtil.DEFAULT_STRING;
        subscriptionDto.maxSms = EntityUtil.DEFAULT_INTEGER;
        subscriptionDto.servicePlanId = EntityUtil.DEFAULT_LONG;
        subscriptionDto.servicePlanName = EntityUtil.DEFAULT_STRING;
        subscriptionDto.device = null;
        return subscriptionDto;
    }

    @Override
    public String toString() {
        return "SubscriptionResponseDto{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", maxSms=" + maxSms +
                ", status='" + status + '\'' +
                ", servicePlanId=" + servicePlanId +
                ", servicePlanName='" + servicePlanName + '\'' +
                ", device=" + device +
                '}';
    }
}
