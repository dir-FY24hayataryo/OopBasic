package company;

public class Department {
    private final String name;
    private final String departmentID;
    private int budget;
    
    //コンストラクター
    public Department(String name,String departmentID,int budget) {
        this.name=name;
        this.departmentID=departmentID;
        this.budget=budget;
    }
    
    //会議を開催する
    public void meeting() {
        System.out.println("部内会議を開催します。部署："+name+"、予算："+budget);
    }
    
    //nameのgetter
    public String getName() {
        return name;
    }
    
    //budgetのgetter
    public double getBudget() {
        return budget;
    }
    
    //budgetのsetter
    public void setBudget(int budget) {
        if (budget<0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        this.budget=budget;
    }
}
