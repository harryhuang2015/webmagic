package us.codecraft.webmagic.pipeline;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;

public interface PagePipeline extends Pipeline   {
    public abstract void process(Page page, Task task);
}
