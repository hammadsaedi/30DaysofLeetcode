class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int start = 0;
        int end = image.length - 1;
        int temp = 0;
        for(int i = 0; i < image.length; i++){
            start = 0;
            end = image.length - 1;
            while(start < end){
                if(image[i][start] == image[i][end]){
                    image[i][start] ^= 1;
                    image[i][end] ^= 1;
                } 
                start++;
                end--;
            }
            if((image[i].length & 1) == 1)
                image[i][(image.length - 1) / 2] ^= 1;
        }
        return image;
    }
}