package com.example.guidanceitschool.ui.main;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guidanceitschool.Lesson;
import com.example.guidanceitschool.R;

import java.util.List;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.LessonViewHolder> {

    private List<Lesson> currentList;

    public void submitList(List<Lesson> currentList) {
        this.currentList = currentList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LessonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lesson, parent, false);
        return new LessonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LessonViewHolder holder, int position) {
        holder.bind(currentList.get(position));
    }

    @Override
    public int getItemCount() {
        return currentList.size();
    }

    class LessonViewHolder extends RecyclerView.ViewHolder {

        private ImageView lessonImage;
        private TextView titleTextView;
        private View topLine;
        private View bottomLine;

        public LessonViewHolder(@NonNull View itemView) {
            super(itemView);

            lessonImage = itemView.findViewById(R.id.image_lesson);
            titleTextView = itemView.findViewById(R.id.title_lesson);
            topLine = itemView.findViewById(R.id.top_line);
            bottomLine = itemView.findViewById(R.id.bottom_line);
        }

        public void bind(Lesson lesson) {
            if (getAdapterPosition() == 0) topLine.setVisibility(View.GONE);
            else topLine.setVisibility(View.VISIBLE);

            if (getAdapterPosition() == currentList.size() - 1) bottomLine.setVisibility(View.GONE);
            else bottomLine.setVisibility(View.VISIBLE);

            Drawable image = ContextCompat.getDrawable(itemView.getContext(), lesson.getImage());
            lessonImage.setImageDrawable(image);
            titleTextView.setText(lesson.getTitle());
        }
    }
}
