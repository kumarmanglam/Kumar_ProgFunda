package com.gradedproject.q2;

class HrDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        return "HR Department";
    }

    @Override
    public String getTodaysWork() {
        return "Team Lunch";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Fill today’s timesheet and mark your attendance";
    }
}