package Department;

public class AdminDepartment extends SuperDepartment{

    @Override
    public String deparmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

}
