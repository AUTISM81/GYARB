public class TickTackToe {
    int xSize[];
    int ySize[];

    public void main(String[] args) {
        grid(3,3);
    }

    public void grid(int xCor, int yCor){
        for (int i = 0; i < xCor;){
            xSize[xCor] = i;
            i++;
        }
        for (int i = 0; i < yCor;){
            ySize[yCor] = i;
            i++;
        }
    }
}
