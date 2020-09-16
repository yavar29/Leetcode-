class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]*=A[i];
        }
        List<Integer> list=new ArrayList<Integer>();
        for(Integer x: A){
            list.add(x);
        }
        Collections.sort(list);
        
        int[] arr=new int[list.size()];
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;
        
        
        
    }
}