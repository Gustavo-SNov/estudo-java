package enumeracao_composicao.ExComposicao.trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Worker {
    private final String name;
    private final WorkerLevel level;
    private final Double baseSalary;

    private final Department department;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // retorna a data e a hora atuais do sistema
        for (HourContract c : contracts) {
            cal.setTime(c.getDate()); // cal receberá a data do contrato
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
