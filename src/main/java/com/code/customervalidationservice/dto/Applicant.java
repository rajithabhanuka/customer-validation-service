package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Applicant {

    public Individual individual;

    public Business business;

    public List<Attachment> attachments;
}
