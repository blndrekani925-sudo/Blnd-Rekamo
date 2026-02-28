import 'package:flutter/material.dart';

void main() => runApp(Blnd96App());

class Blnd96App extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Colors.black, // ره‌نگێ تيك توكێ
        appBar: AppBar(
          title: Text("blnd.96"),
          backgroundColor: Colors.transparent,
          centerTitle: true,
        ),
        body: ListView.builder(
          itemCount: 5, // هژمارا ڤیدیۆیان
          itemBuilder: (context, index) {
            return Container(
              height: 600, // درێژاهیا ڤیدیۆیێ
              margin: EdgeInsets.all(10),
              color: Colors.grey[800],
              child: Center(
                child: Text(
                  'ڤیدیۆیا ژماره‌ ${index + 1}',
                  style: TextStyle(color: Colors.white, fontSize: 20),
                ),
              ),
            );
          },
        ),
      ),
    );
  }
}