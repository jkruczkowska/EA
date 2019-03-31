<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>List of beacons</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Location</th>
        <th>Range</th>
        <th>MAC address</th>
    </tr>
    <c:forEach items="${beacons}" var="beac">
        <tr>
            <td>${beac.name}</td>
            <td>${beac.location}</td>
            <td>${beac.signalRange}</td>
            <td>${beac.macAddress}</td>
        </tr>
    </c:forEach>
</table>