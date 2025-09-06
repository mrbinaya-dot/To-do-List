public class Lists {
     private String task ;
    private Boolean mark;
 public Lists(String task){
     this.task=task;
     this.mark = false ;

 }
public String getTask (){
     return task;



}
public void Ismark(){
     this.mark=true;
}
public Boolean getMark(){
     return mark;
}
    public String toString() {
        return (mark ?  "[X] " : "[ ] ")+ task;
 }


}
