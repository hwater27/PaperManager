public class PaperNode implements Node, Comparable<PaperNode>{
    private Paper paper;
    public Paper getPaper(){
        return paper;  
    }
    @Override
    public int compareTo(PaperNode pNode){
        return this.getPaper().title.compareTo(pNode.getPaper().title);
    }
}