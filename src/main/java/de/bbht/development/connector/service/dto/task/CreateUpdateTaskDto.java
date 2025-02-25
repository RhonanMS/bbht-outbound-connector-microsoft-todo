package de.bbht.development.connector.service.dto.task;

import de.bbht.development.connector.service.dto.enums.ImportanceDto;
import de.bbht.development.connector.service.dto.enums.TaskStatusDto;
import java.util.List;
import java.util.Objects;

public class CreateUpdateTaskDto {

  private String title;
  private String body;
  private List<String> categories;
  private DateTimeTimeZoneDto completedDateTime;
  private DateTimeTimeZoneDto dueDateTime;
  private ImportanceDto importance;
  private DateTimeTimeZoneDto startDateTime;
  private TaskStatusDto status;

  public CreateUpdateTaskDto() {
    // empty constructor
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
    if (!(o instanceof CreateUpdateTaskDto that)) {
      return false;
    }
    return Objects.equals(title, that.title) && Objects.equals(body, that.body) && Objects.equals(categories,
        that.categories) && Objects.equals(completedDateTime, that.completedDateTime) && Objects.equals(dueDateTime,
        that.dueDateTime) && importance == that.importance && Objects.equals(startDateTime, that.startDateTime)
        && status == that.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body, categories, completedDateTime, dueDateTime, importance,
        startDateTime, status);
  }

  @Override
  public String toString() {
    return "CreateUpdateTaskDto{" + "title='" + title + '\'' + ", body='" + body + '\''
        + ", categories=" + categories + ", completedDateTime=" + completedDateTime
        + ", dueDateTime=" + dueDateTime + ", importance=" + importance + ", startDateTime="
        + startDateTime + ", status=" + status + '}';
  }
}
