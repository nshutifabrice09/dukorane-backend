package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Gig;
import com.dukorane.Dukorane_backend.model.Skill;
import com.dukorane.Dukorane_backend.model.User;
import com.dukorane.Dukorane_backend.repository.GigRepository;
import com.dukorane.Dukorane_backend.repository.SkillRepository;
import com.dukorane.Dukorane_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigServiceImplementation implements GigService{
    private final GigRepository gigRepository;
    private final UserRepository userRepository;
    private final SkillRepository skillRepository;

    @Autowired
    public GigServiceImplementation(GigRepository gigRepository, UserRepository userRepository, SkillRepository skillRepository) {
        this.gigRepository = gigRepository;
        this.userRepository = userRepository;
        this.skillRepository = skillRepository;
    }

    @Override
    public List<Gig> getAllGigs() {
        return gigRepository.findAll();
    }

    @Override
    public Gig getGigById(Long id) {
        return gigRepository.findGigById(id);
    }

    @Override
    public Gig saveGig(Gig gig, Long userId, Long skillId) {
        User user = userRepository.findUserById(userId);
        Skill skill = skillRepository.findSkillById(skillId);
        gig.setEmployer(user);
        gig.setSkillRequired(skill);
        return gigRepository.save(gig);
    }

    @Override
    public Gig updateGig(Long id, Gig gig) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        gigRepository.deleteById(id);
    }
}
