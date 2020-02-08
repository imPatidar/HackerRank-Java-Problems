import java.util.Scanner;

class solution6{

    public static void main(String[] args) {
        document[] d = new document[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < d.length ; i++) {

            int id= sc.nextInt();
            sc.nextLine();
            String title= sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();
            d[i] = new document(id, title, folderName, pages);
        }

        document[] result = docsWithOddPages(d);
        for (int i = 0; i < result.length ; i++) {
            if(result[i]!=null){
                System.out.println(result[i].getId()+" "+result[i].getTitle()+" "+result[i].getFolderName()+" "+result[i].getPages());

            }
        }

    }
    public static document[] docsWithOddPages(document[] d){

        document[] temp = new document[4];
        int j=0;

        //Separate Odd Pages
        for (int i = 0; i < d.length; i++) {
            if(d[i].getPages()%2 !=0){
                temp[j++]=d[i];
            }

        }

        //Sort Odd Pages
        for (int i = 0; i <j-1; i++) {
            for (int k = 0; k <j-i-1 ; k++) {
                if(temp[k].getId()<temp[k+1].getId()){
                    document ds=temp[k];
                    temp[k] = temp[k+1];
                    temp[k+1] = ds;
                }
            }
        }

        return temp;
    }
}

class document{
    int id;
    String title;
    String folderName;
    int pages;

    public document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}