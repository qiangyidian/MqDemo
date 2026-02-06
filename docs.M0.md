# M0：项目初始化与环境准备

## 目标
- 本地 5 分钟内启动 RabbitMQ。
- 能通过管理台验证 Broker 状态可用。

## 核心概念
- **Broker**：消息中间件服务进程。
- **Queue**：消息队列，消费者从这里拉取/接收消息。
- **Management UI**：RabbitMQ 可视化控制台，便于教学验证。

## 实现步骤
1. 使用 `docker-compose.yml` 启动 `rabbitmq:3.13-management`。
2. 暴露 AMQP 端口 `5672` 和管理台端口 `15672`。
3. 预置教学账号 `demo/demo123`。

## 验证方式
```bash
docker compose up -d
docker compose ps
docker compose logs rabbitmq --tail=30
```

预期：
- `rabbitmq` 服务状态为 `healthy` 或 `running`。
- 浏览器访问 `http://localhost:15672` 可登录。

## 常见坑
- 5672/15672 端口被占用：改 compose 映射端口。
- Docker Desktop 未启动：`docker compose` 会直接失败。
- 登录失败：确认环境变量账号密码与登录输入一致。

## 验收清单
- [ ] `docker compose up -d` 成功。
- [ ] 可登录 RabbitMQ 管理台。
- [ ] 看到默认 `guest` 之外的 `demo` 用户。

## 下一模块预告
M1 将实现最小可用链路：HTTP 接口触发 Producer 发消息，Consumer 打印日志消费。
