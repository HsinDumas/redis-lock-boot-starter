package me.hsindumas.redis.lock.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Zho.Xin
 * @since 2020/5/18
 */
@Data
@ConfigurationProperties(prefix = "lock")
public class LockProperties {
  /** 锁超时时间 */
  private Long lockTime = 30000L;
  /** 等待加锁超时时间 -1一直等待 */
  private Long waitTime = 10000L;
}
