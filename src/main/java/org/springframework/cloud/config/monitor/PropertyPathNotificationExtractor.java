package org.springframework.cloud.config.monitor;

import java.util.Map;

import org.springframework.util.MultiValueMap;

/**
 * Strategy for extracting a {@link PropertyPathNotification} from an incoming,
 * unstructured request. Different providers of notifications have different payloads for
 * their events, and different headers (e.g. HTTP headers for a webhook).
 *
 * @author Dave Syer
 *
 */
public interface PropertyPathNotificationExtractor {

	PropertyPathNotification extract(MultiValueMap<String, String> headers, Map<String, Object> payload);

}
