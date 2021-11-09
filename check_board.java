package Java2_pro;

import java.util.ArrayList;
import java.util.Scanner;

public class check_board {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		// list를 밖으로 빼야 반복문에서만 쓰고 버리기가 되지 않는다.
		
		while(true) {
			System.out.print("명령어를 입력해주세요 :");
			String order = sc.nextLine();
			
			
			
			
			if(order.equals("help")) { // 문자비교는 .equals()로 비교한다.
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
			}
			else if(order.equals("add")) { // 추가
				System.out.println("제목을 입력해주세요 : ");
				String 제목 = sc.nextLine();
				list.add(제목);
				System.out.println("내용을 입력해주세요 :");
				String 내용 = sc.nextLine();
				list2.add(내용);
				System.out.println("게시물이 저장되었습니다.");
				
			}
			else if(order.equals("list")) { // 조회
				
				for(int i = 0; i < list.size(); i++) {
					System.out.print("번호 :");
					System.out.println(i + 1);
					System.out.print("제목 :");
					System.out.println(list.get(i));
					System.out.print("내용 :");
					System.out.println(list2.get(i));
					System.out.println("================================");
				}	
			}
			
			else if(order.equals("update")) { // 수정
				System.out.println("수정할 게시물 번호:");
				int fix = Integer.parseInt(sc.nextLine());
				System.out.println("제목:");
				String 제목 = sc.nextLine();
				list.set(fix -1, 제목);
				System.out.println("내용:");
				String 내용 = sc.nextLine();
				list2.set(fix - 1, 내용);
				System.out.println("수정이 완료되었습니다.");
					
			}
			else if(order.equals("remove")) { // 삭제
				
				
			}
			
			
			
			
		}
			
		
			
		
		
		
		
	}

}

