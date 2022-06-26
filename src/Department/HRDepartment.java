package Department;

public class HRDepartment extends SuperDepartment{

    @Override
    public String deparmentName() {
        return "Hr Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today's timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team lunch";
    }
}
