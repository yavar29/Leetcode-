class Solution {
public String makeGood(String s) {

    StringBuffer st=new StringBuffer(s);
    int p = 0,p1=0;
    int n=st.length();
    int i=0;
	while(i<n-1) {
		 p=(int)st.charAt(i);
		 p1=(int)st.charAt(i+1);
		if((p==p1-32) ||(p1==p-32)) {
			st.deleteCharAt(i);
			st.deleteCharAt(i);
			if(i!=0)
				i--;
			n=st.length();
		}
		else {
			i++;
		}
	}
    return st.toString();
}
}