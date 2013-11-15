import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class GOLReverse{
	public static void main(String args[]) throws IOException{
			ArrayList<Cell> board = new ArrayList<Cell>();
			int generations = 0;
			//read in board from file
			String currentLine = "";
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			while((currentLine = br.readLine())!= null){
				String[] tmpBoard = currentLine.split(",");	
				generations = Integer.parseInt(tmpBoard[1]);
				for (int x = 2; x < tmpBoard.length; x++){
					if(Integer.parseInt(tmpBoard[x]) == 1){
						board.add(new Cell(true));
					}
					else{
						board.add(new Cell(false));
					}
				}
			}
		
		for(int x = 0; x < board.size(); x++){
			System.out.println(board.get(x).isAlive());
		}
	}
}
	

