import java.io.File;

public class Test {
    public static void main(String[] args)
    {
        File file=new File("C:\\Users\\lenovo\\IdeaProjects\\CmdStop\\src\\user.xlsx");
        ReadExcel readExcel=new ReadExcel();
        User  users[]= readExcel.readExcel(file);

        System.out.printf("请输入用户名：");






    }


}
