package io.github.vanessa85.notekeeper

object DataManager {
    var courses = HashMap<String, CourseInfo>()
    var notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")

        var note = NoteInfo(course, "Android", "Android programming")
        notes.add(note)
    }

}