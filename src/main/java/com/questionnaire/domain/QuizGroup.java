package com.questionnaire.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@NoArgsConstructor
@Data
@Document(collection = "quizzes")
public class QuizGroup {

    @Id
    public ObjectId _id;
    public String quizName;
    public String quizImage;
    public String quizDescription;
    public String groupId;
    public String searchTerm;

    public QuizGroup(ObjectId _id, String quizName, String quizImage, String quizDescription, String groupId, String searchTerm) {
        this._id = _id;
        this.quizName = quizName;
        this.quizImage = quizImage;
        this.quizDescription = quizDescription;
        this.groupId = groupId;
        this.searchTerm = searchTerm;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizImage() {
        return quizImage;
    }

    public void setQuizImage(String quizImage) {
        this.quizImage = quizImage;
    }

    public String getQuizDescription() {
        return quizDescription;
    }

    public void setQuizDescription(String quizDescription) {
        this.quizDescription = quizDescription;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
