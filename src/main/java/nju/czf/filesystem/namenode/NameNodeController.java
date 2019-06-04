package nju.czf.filesystem.namenode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import nju.czf.filesystem.block.*;
import nju.czf.filesystem.datanode.*;


/**
 * Restful接口
 */
@RestController
public class NameNodeController {

    @Autowired
    BlockRepository blockRepository;

    @Autowired
    DataNodeRepository dataNodeRepository;


}
