package seminar2.solid.i;

public interface IPrintTasks {
	
    boolean printContent(String content);
    boolean scanContent(String content);
    boolean faxContent(String content);
    boolean photoCopyContent(String content);
    boolean badgeAuth(String content);

}