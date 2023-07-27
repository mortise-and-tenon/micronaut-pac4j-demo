## Demo 说明

该 Demo 对接了 Gitee 的 OAuth 2.0 协议。

`application.yml` 中针对认证的配置为：

```yaml
mortnon:
  pac4j:
    global: false
```

该配置表明，仅访问特定 API `http://localhost/sso/login` ，才会触发 SSO 跳转逻辑，其他 API 会直接 401。

如果 `global` 调整为 `true`，则任意 API 都将进入 SSO 跳转逻辑。


