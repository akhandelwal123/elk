package com.rest.elk;

import java.io.IOException;

import com.rest.elk.util.FileUtil;

/**
 * Created by askdrcatcher on 3/16/17.
 */
class StopList {

    private StopWords stopWords;

    public StopList() {
        this.stopWords = new StopWords();
    }

    public StopList generateStopWords(FileUtil fileUtil) throws IOException {
        final FileUtil fileUtilIterator = fileUtil.iterator();
        while(fileUtilIterator.hasNext()) {
            stopWords.add(fileUtilIterator.next());
        }
        return this;
    }

    public StopWords getStopWords() {
        return stopWords;
    }
}
