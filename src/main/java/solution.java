import org.apdplat.word.WordSegmenter;

import java.io.File;

public class solution{
    public static void main(String[] args) throws Exception {
        String input = "/home/mjq/桌面/file1";
        String output = "/home/mjq/桌面/word";
        WordSegmenter.seg(new File(input),new File(output));
    }



}