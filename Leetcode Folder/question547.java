class Solution {
    public int isConnected(int[][] isConnected) {
        //represents cities that are connected
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        //iterate through every city
        for(int i=0; i<isConnected.length; i++){
            if(visited[i]) continue;
            //recursion stack will represent all traversals possible in city i
            dfs(i, visited, isConnected);
            count++;

        }

        return count;
    }

    private void dfs(int node, boolean[] visited, int[][] isConnected){
        //we have now visited the city
        if(visited[node]) return;
        visited[node] = true;

        //recursion stack will represent direct/indirect connections
        for(int i=0; i<isConnected[node].length; i++){
            if(isConnected[node][i]==1){
                dfs(i, visited, isConnected);
            }
        }

        return;
    }
}
