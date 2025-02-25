package de.bbht.development.connector.service.dto.task;

import de.bbht.development.connector.service.dto.enums.ImportanceDto;
import de.bbht.development.connector.service.dto.enums.TaskStatusDto;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

public class TaskDto {

  private String id;
  private String title;
  private String body;
  private OffsetDateTime bodyLastModifiedDateTime;
  private List<String> categories;
  private DateTimeTimeZoneDto completedDateTime;
  private OffsetDateTime createdDateTime;
  private DateTimeTimeZoneDto dueDateTime;
  private ImportanceDto importance;
  private OffsetDateTime lastModifiedDateTime;
  private DateTimeTimeZoneDto startDateTime;
  private TaskStatusDto status;

  public TaskDto() {
    // empty constructor
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public OffsetDateTime getBodyLastModifiedDateTime() {
    return bodyLastModifiedDateTime;
  }

  public void setBodyLastModifiedDateTime(OffsetDateTime bodyLastModifiedDateTime) {
    this.bodyLastModifiedDateTime = bodyLastModifiedDateTime;
  }

  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public DateTimeTimeZoneDto getCompletedDateTime() {
    return completedDateTime;
  }

  public void setCompletedDateTime(DateTimeTimeZoneDto completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public DateTimeTimeZoneDto getDueDateTime() {
    return dueDateTime;
  }

  public void setDueDateTime(DateTimeTimeZoneDto dueDateTime) {
    this.dueDateTime = dueDateTime;
  }

  public ImportanceDto getImportance() {
    return importance;
  }

  public void setImportance(ImportanceDto importance) {
    this.importance = importance;
  }

  public OffsetDateTime getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public DateTimeTimeZoneDto getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(DateTimeTimeZoneDto startDateTime) {
    this.startDateTime = startDateTime;
  }

  public TaskStatusDto getStatus() {
    return status;
  }

  public void setStatus(TaskStatusDto status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TaskDto taskDto)) {
      return false;
    }
    return Objects.equals(id, taskDto.id) && Objects.equals(title, taskDto.title) && Objects.equals(body, taskDto.body)
        && Objects.equals(bodyLastModifiedDateTime, taskDto.bodyLastModifiedDateTime) && Objects.equals(categories,
        taskDto.categories) && Objects.equals(completedDateTime, taskDto.completedDateTime) && Objects.equals(
        createdDateTime, taskDto.createdDateTime) && Objects.equals(dueDateTime, taskDto.dueDateTime)
        && importance == taskDto.importance && Objects.equals(lastModifiedDateTime, taskDto.lastModifiedDateTime)
        && Objects.equals(startDateTime, taskDto.startDateTime) && status == taskDto.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, body, bodyLastModifiedDateTime, categories, completedDateTime,
        createdDateTime, dueDateTime, importance, lastModifiedDateTime, startDateTime, status);
  }

  @Override
  public String toString() {
    return "TaskDto{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", body='" + body + '\''
        + ", bodyLastModifiedDateTime=" + bodyLastModifiedDateTime + ", categories=" + categories
        + ", completedDateTime=" + completedDateTime + ", createdDateTime=" + createdDateTime
        + ", dueDateTime=" + dueDateTime + ", importance=" + importance + ", lastModifiedDateTime="
        + lastModifiedDateTime + ", startDateTime=" + startDateTime + ", status=" + status + '}';
  }
}
