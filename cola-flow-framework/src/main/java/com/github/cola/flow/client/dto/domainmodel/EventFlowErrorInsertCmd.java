package com.github.cola.flow.client.dto.domainmodel;

import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * Project Name: cola-flow
 * Desc: 事件流程错误时保存流程信息Command
 *
 * @author xihadoufuche@aliyun.com
 */
@Data
public class EventFlowErrorInsertCmd extends Command {
    /**
     * 业务id
     */
    private String bizId;
    /**
     * 流程节点名
     */
    private String eventName;
    /**
     * 流程定义
     */
    private Integer traceFlowId;
    /**
     * 流程信息
     */
    private String flowInfo;
    /**
     * 是否暫停節點
     */
    private boolean isSuspendEvent;
}
