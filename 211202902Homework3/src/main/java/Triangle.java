// Classify a triangle based on its angles.
// This method returns the triangle type as a TriangleType enum value.

public class Triangle{

    public static TriangleType triangle(int angle1, int angle2, int angle3){

        // Identify right-angled triangles
        if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)){
            return TriangleType.RIGHT;}

        // Identify obtuse-angled triangles
        if ((angle1 > 90) || (angle2 > 90) || (angle3 > 90)){
            return TriangleType.OBTUSE;}

        // Identify acute-angled triangles
        if ((angle1 < 90) && (angle2 < 90) && (angle3 < 90)){
            return TriangleType.ACUTE;}

        // Reject invalid triangle
        if ((angle1+angle2+angle3 > 180)){
            return TriangleType.INVALID;}

        return (TriangleType.INVALID);

    }
}