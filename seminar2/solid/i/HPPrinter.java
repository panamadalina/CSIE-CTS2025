package seminar2.solid.i;

public class HPPrinter  implements IPrintTasks {
        public boolean faxContent(String content)
        {
        	
        	System.out.println("Fax Done"); return true;
        }
        public boolean photoCopyContent(String content)
        {
        	System.out.println("PhotoCopy Done"); return true;
        }
        public boolean printContent(String content)
        {
        	System.out.println("Print Done"); return true;
        }
        public boolean badgeAuth(String content)
        {
        	System.out.println("Print Auth Done"); return true;
        }
        public boolean scanContent(String content)
        {
        	System.out.println("Scan Done"); return true;
        }
    
}