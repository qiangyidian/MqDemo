# MQ 渐进式教程项目（RabbitMQ + Spring Boot）

## 为什么本教程选择 RabbitMQ（新手友好）
1. **概念门槛较低**：以 Queue、Exchange、Routing Key 为核心，易于理解和可视化。
2. **本地启动简单**：Docker 一条命令即可启动，管理台可直接观察消息流转。
3. **教学场景覆盖完整**：确认机制、重试、死信、幂等等核心主题都能落地演示。

## 教程目标与项目形态
- 项目形态：`Web API + Producer + Consumer` 的单体示例（后续逐步拆分职责）。
- 能力目标：
  - M1：最小可用收发
  - M2：可靠投递（ack / retry / dead-letter）
  - M3：幂等去重
  - M4：监控与可观测性
  - M5：压测与优化建议

## 当前进度
- ✅ 已完成：基础工程初始化（M0 的第一小阶段）
- ⏭️ 下一步：补充 `docker-compose.yml` 并完成 RabbitMQ 环境准备。

## 目录结构
```text
.
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java/com/example/mqdemo/MqDemoApplication.java
    │   └── resources/application.yml
    └── test
        └── java/com/example/mqdemo
```
