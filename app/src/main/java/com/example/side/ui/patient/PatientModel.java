package com.example.side.ui.patient;

public class PatientModel {
    private String patientName;
    private String patientPhone;
    private int patientAge;
    private String patientAddress;
    private String patientStatus;
    private String patientX_RayOrAnalysis;
    private String patientSelectDate;

    public PatientModel(String patientName, String patientPhone,
                        int patientAge, String patientAddress,
                        String patientStatus, String patientX_RayOrAnalysis,
                        String patientSelectDate) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientStatus = patientStatus;
        this.patientX_RayOrAnalysis = patientX_RayOrAnalysis;
        this.patientSelectDate = patientSelectDate;
    }
}
