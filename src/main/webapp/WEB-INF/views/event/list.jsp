<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>List of events</h1>
<table>
    <tr>
        <th>Date</th>
        <th>Name</th>
        <th>Scenario</th>
    </tr>
    <c:forEach items="${events}" var="ev">
        <tr>
            <td>${ev.date}</td>
            <td>${ev.eventName}</td>
            <td>${ev.scenario.description}</td>
        </tr>
    </c:forEach>
</table>