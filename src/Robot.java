import java.util.ArrayList;


public class Robot {
	int ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo;
ArrayList<Cell> c180444ll16 = new ArrayList<Cell>();
public Robot(){
	c180444ll16.add(new Cell(1, 0, 1, 1, true, 0));
	c180444ll16.add(new Cell(1, 0, 0, 0, false, 1));
	c180444ll16.add(new Cell(1, 1, 1, 0, false, 2));
	c180444ll16.add(new Cell(0, 1, 1, 0, false, 4));
	c180444ll16.add(new Cell(1, 0, 0, 1, false, 3));
	c180444ll16.add(new Cell(0, 1, 0, 1, false, 6));
}
public void addCell(Cell x){
c180444ll16.add(x);//hi other people who program
}
public Cell getNextCell(){
	return c180444ll16.get(1);
}
public Cell getCurrentCell(){
	return c180444ll16.get(0);
}
public Cell getCell(int cellBlock){
	return c180444ll16.get(cellBlock);
}
public void move(){if(c180444ll16.get(1).getWalls()==3){c180444ll16.remove(1);}c180444ll16.remove(0);}







//pub scrubs the love the dubs
}

