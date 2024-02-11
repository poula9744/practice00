package com.javaex.ex07;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		String input = "사십만삼천백십오";
		
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}
		
		public static long hangulToNum(String input) {
			long result = 0;
			long tmpResult = 0;
			long num = 0;
			
			final String NUMBER = "영일이삼사오육칠팔구";
			final String UNIT = "십백천만억조";
			final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10, 8), (long)Math.pow(10, 12)};
			//Math.pow: 지정된 숫자의 지정된 거듭제곱
			
			//StringTokenizer(String str, String delim, boolean returnDelims): 
			//문자열(str)을 지정된 구분자(delim)으로 나누는 StringTokenizer를 생성한다
			//returnDelims의 값을 true로 하면 구분자도 토큰으로 간주된다
			StringTokenizer st = new StringTokenizer(input, UNIT, true);
			
			while(st.hasMoreTokens()) { //boolean hasMoreTokens(): 토큰이 남아있는지 알려준다
				String token = st.nextToken(); //String nextToken(): 다음 토큰을 반환한다
				
				int check = NUMBER.indexOf(token); //숫자인지 단위(UNIT)인지 확인
				
				if(check==-1) {
					if("만억조".indexOf(token)==-1) { //boolean indexOf: 문자열이 존재하지 않는 경우 -1 반환
						tmpResult += (num!=0 ? num:1)*UNIT_NUM[UNIT.indexOf(token)];
						//num이 0이 아니라면 num을, 0이라면 1을 tmpResult에 더한다
						
						//삼항연산자 ?
						//조건식 ? 반환값1:반환값2  ==> true면 반환값1을 반환, false면 반환값2를 반환
						
					}else {
						tmpResult += num;
						result += (tmpResult !=0 ? tmpResult : 1)*UNIT_NUM[UNIT.indexOf(token)];
						
						tmpResult = 0;
					}
					num = 0;
				}else {
					num = check;
				}
			}return result + tmpResult + num;
		}

	}


